package com.casic.icms.job.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.casic.icms.job.entity.Job;

import java.util.List;

/**
 * @author MrBird
 */
public interface JobMapper extends BaseMapper<Job> {

    List<Job> queryList();
}