package com.docmind.backend.service;

import com.docmind.backend.entity.KnowledgeBase;
import java.util.List;

public interface KnowledgeBaseService {
    //创建知识库
    boolean create(KnowledgeBase knowledgeBase);

    //查询所有知识库
    List<KnowledgeBase> list();

    //根据 iD 查询
    KnowledgeBase getById(Long id);

    //修改知识库
    boolean update(KnowledgeBase knowledgeBase);

    //删除知识库
    boolean delete(Long id);
}
