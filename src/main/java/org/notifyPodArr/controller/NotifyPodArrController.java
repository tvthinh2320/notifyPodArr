package org.notifyPodArr.controller;

import lombok.RequiredArgsConstructor;
import org.notifyPodArr.dto.NotifyPodArr;
import org.notifyPodArr.dto.Response;
import org.notifyPodArr.service.NotifyPodArrService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifyPodArr")
@RequiredArgsConstructor
public class NotifyPodArrController {

    private final NotifyPodArrService notifyPodArrService;

    @PostMapping
    public ResponseEntity<Response> notifyPodArr(@RequestBody NotifyPodArr notifyPodArr) {

        boolean flag = notifyPodArrService.notify(notifyPodArr);
        if(flag) {
            Response response = new Response();
            response.setCode("0");
            response.setMessage("Successful");
            response.setReqCode(notifyPodArr.getReqCode());
            return ResponseEntity.ok(response);

        }
        Response response = new Response();
        response.setCode("1");
        response.setMessage("Failed");
        response.setReqCode(notifyPodArr.getReqCode());
        return ResponseEntity.ok(response);

    }
}
