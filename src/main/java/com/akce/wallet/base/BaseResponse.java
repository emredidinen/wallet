package com.akce.wallet.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Emre on 10.05.2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel
public class BaseResponse {
  //  @ApiModelProperty(value = "İşlem hakkında mesaj.", example = "İşleminiz başarıyla sonuçlanmıştır.")
    protected String message;
}

