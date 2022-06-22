package com.project.moyeodream.service;

import com.project.moyeodream.domain.vo.PostVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    public List<PostVO> getList();

    public List<PostVO> getCategoryList(String postCategory);

    public PostVO postRead(int postNumber);

    public PostVO myPost(int postNumber);

    public void postRegister(PostVO postVO);

    public boolean postUpdate(PostVO postVO);

    public boolean postDelete(int postNumber);
}
