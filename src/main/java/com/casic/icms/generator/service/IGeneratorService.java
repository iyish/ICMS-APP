package com.casic.icms.generator.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.casic.icms.common.entity.QueryRequest;
import com.casic.icms.generator.entity.Column;
import com.casic.icms.generator.entity.Table;

import java.util.List;

/**
 * @author MrBird
 */
public interface IGeneratorService {

    List<String> getDatabases(String databaseType);

    IPage<Table> getTables(String tableName, QueryRequest request, String databaseType, String schemaName);

    List<Column> getColumns(String databaseType, String schemaName, String tableName);
}
