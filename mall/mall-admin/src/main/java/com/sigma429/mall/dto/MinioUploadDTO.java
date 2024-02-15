package com.sigma429.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件上传返回结果
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MinioUploadDTO {
    @ApiModelProperty("文件访问URL")
    private String url;
    @ApiModelProperty("文件名称")
    private String name;
}
