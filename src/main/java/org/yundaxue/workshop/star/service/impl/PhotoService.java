package org.yundaxue.workshop.star.service.impl;

import org.yundaxue.workshop.star.bo.Photo;

import java.awt.*;

public class PhotoService {
    Photo getPhoto (Long photoId) throws Exception;
    List <Photo> listPhoto (Long userId ) throws Exception;
    void inserPhoto(Photo photo) throws Exception;
}
