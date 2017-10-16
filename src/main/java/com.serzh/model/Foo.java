package com.serzh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo implements Serializable {

    private long id;

    @Size(min = 5, max = 14)
    private String name;

}
