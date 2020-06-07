package edu.nyu.blog.service;

import edu.nyu.blog.po.Tag;
import edu.nyu.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id, Tag tag);

    void deleteTag(Long id);
}
