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
public class GenericResponse<Content> extends BaseResponse {
    Content content;

    public GenericResponse(String message, Content content) {
        super(message);
        this.content = content;
    }
}