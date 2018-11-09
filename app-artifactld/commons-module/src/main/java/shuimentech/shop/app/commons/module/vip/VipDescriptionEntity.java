package shuimentech.shop.app.commons.module.vip;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "Vip权益介绍 数据模型", description = "Vip权益介绍 数据模型")
@Data
public class VipDescriptionEntity {
    @ApiModelProperty(value = "identifier", name = "id", notes = "唯一标识符",
            dataType = "string", readOnly = true)
    private String id;
    @ApiModelProperty(value = "introduction", name = "introduction", notes = "介绍内容",
            dataType = "string")
    private String introduction;
}
