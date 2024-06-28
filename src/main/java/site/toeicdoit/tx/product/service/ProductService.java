package site.toeicdoit.tx.product.service;


import site.toeicdoit.tx.domain.model.MessengerVo;
import site.toeicdoit.tx.product.model.ProductDto;
import site.toeicdoit.tx.product.model.ProductModel;

public interface ProductService {
    default ProductModel dtoToEntity(ProductDto dto) {
        return ProductModel.builder()
                .id(dto.getId())
                .name(dto.getName())
                .price(dto.getPrice())
                .description(dto.getDescription())
                .duration(dto.getDuration())
                .build();
    }

    MessengerVo payment(ProductDto dto);
}
