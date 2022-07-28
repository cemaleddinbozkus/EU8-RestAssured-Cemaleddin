package com.cybertek.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString


@JsonIgnoreProperties(ignoreUnknown = true) //this is from jackson
public class Regions {

    private List<Region>items;
    private int count;
}
