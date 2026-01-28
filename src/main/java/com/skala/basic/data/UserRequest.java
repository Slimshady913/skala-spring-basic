package com.skala.basic.data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserRequest {

    @NotEmpty
    private String userID;

    @NotEmpty
    private String userName;

    @Pattern(regexp = "^[mfMF]$", message = "성별은 M 또는 F만 입력 가능합니다.")
    private String userGender;

    private String userPhone;
    
}
