package org.yundaxue.workshop.star.dao;

import org.apache.ibatis.annotations.Param;
import org.yundaxue.workshop.star.bo.Photo;

import java.util.List;

public interface photodao {
    Photo getPhoto(@Param("photoId") Long photoId  )throws Exception;
    List<Photo> ListPhoto(@Param("userId")  Long userId) throws Exception;
    void insetPhoto(@Param("photo")  Photo photo) throws Exception;
}
