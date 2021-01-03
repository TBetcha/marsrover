package com.tbetcha.marsRover.response;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverApiResponse {
    List<MarsPhoto> photos = new ArrayList<MarsPhoto>();

    @Override
    public String toString() {
        return "MarsRoverApiResponse{" +
                "photos=" + photos +
                '}';
    }

    public List<MarsPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<MarsPhoto> photos) {
        this.photos = photos;
    }
}
