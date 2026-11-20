package com.docmind.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class KnowledgeBaseDTO {
    @NotBlank(message="知识库不能为空")
    @Size(max = 100,message = "知识库名称不能超过 100个字符")
    private String name;

    @Size(max = 500,message = "知识库描述不能超过 500字符")
    private String description;


}
