package com.myTraining.core.models;

import com.myTraining.core.services.CustomConfig;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.annotation.Resource;

@Model(adaptables = Resource.class)
public class Test {

    @OSGiService
    CustomConfig ci;

}
