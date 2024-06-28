package site.toeicdoit.tx.subscribe.service;


import site.toeicdoit.tx.domain.model.MessengerVo;
import site.toeicdoit.tx.subscribe.model.SubscribeDto;
import site.toeicdoit.tx.subscribe.model.SubscribeModel;

public interface SubscribeService {

    default SubscribeModel dtoToEntity(SubscribeDto dto) {
        return SubscribeModel.builder()
                .id(dto.getId())
                .userId(UserModel.builder().id(dto.getUserId()).build())
                .createdAt(dto.getCreatedAt())
                .endDate(dto.getEndDate())
                .subscribeState(dto.getSubscribeState())
                .build();

    }


    MessengerVo save(SubscribeDto dto);
}
