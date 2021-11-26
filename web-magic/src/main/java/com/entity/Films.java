package com.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Films {
    private Integer idfilm;

    private String title;

    private String yr;

    private String poster;

    private Double avgrating;

    private String description;

    private String director;

    private String leadactors;

    private String typelist;

    private String backpost;
}