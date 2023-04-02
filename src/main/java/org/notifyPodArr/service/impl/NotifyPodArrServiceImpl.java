package org.notifyPodArr.service.impl;

import org.notifyPodArr.dto.NotifyPodArr;
import org.notifyPodArr.service.NotifyPodArrService;
import org.springframework.stereotype.Service;

@Service
public class NotifyPodArrServiceImpl implements NotifyPodArrService {
    @Override
    public boolean notify(NotifyPodArr notifyPodArr) {
        if(notifyPodArr.getReqCode().isBlank() ||
            notifyPodArr.getPodTyp().isBlank() ||
            notifyPodArr.getPodNum().isBlank() ||
            notifyPodArr.getCallTyp().isBlank()
        ) {
            return false;
        }
        return true;


    }
}
