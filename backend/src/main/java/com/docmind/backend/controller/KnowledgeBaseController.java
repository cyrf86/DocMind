package com.docmind.backend.controller;

import com.docmind.backend.dto.KnowledgeBaseDTO;
import com.docmind.backend.entity.KnowledgeBase;
import com.docmind.backend.service.KnowledgeBaseService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/knowledge-bases")
public class KnowledgeBaseController {
    private final KnowledgeBaseService knowledgeBaseService;
    public KnowledgeBaseController(KnowledgeBaseService knowledgeBaseService){
        this.knowledgeBaseService=knowledgeBaseService;
    }

    //创建知识库
    @PostMapping
    public String create(@Valid @RequestBody KnowledgeBaseDTO dto){
        KnowledgeBase knowledgeBase=new KnowledgeBase();
        knowledgeBase.setName(dto.getName());
        knowledgeBase.setDescription(dto.getDescription());

        knowledgeBaseService.create(knowledgeBase);
        return  "知识库创建成功，ID："+knowledgeBase.getId();
    }

    //查询所有知识库
    @GetMapping
    public List<KnowledgeBase> list() {
        return knowledgeBaseService.list();
    }

    //根据 ID 查询
    @GetMapping("/{id}")
    public  KnowledgeBase getById(@PathVariable Long id){
        return knowledgeBaseService.getById(id);
    }

    //修改知识库
    @PutMapping("/{id}")
    public String update(
            @PathVariable Long id,
            @RequestBody KnowledgeBase knowledgeBase
    ){
        knowledgeBase.setId(id);
        boolean success=knowledgeBaseService.update(knowledgeBase);
        return  success ? "修改成功":"修改失败";
    }

    //删除知识库
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        boolean success=knowledgeBaseService.delete(id);
        return  success ? "删除成功":"删除失败";
    }

}
