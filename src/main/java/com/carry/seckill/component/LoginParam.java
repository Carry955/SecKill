package com.carry.seckill.component;

import com.carry.seckill.validator.IsMobile;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
@ToString
public class LoginParam {
    @NotEmpty(message = "手机号不能为空")
    @IsMobile
    private String mobile;

    @NotEmpty
    @Length(min = 6, message = "密码长度需要大于等于6个字符")
    private String password;
}
