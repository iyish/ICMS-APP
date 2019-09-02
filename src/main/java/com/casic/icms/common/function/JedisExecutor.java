package com.casic.icms.common.function;

import com.casic.icms.common.exception.RedisConnectException;

/**
 * @author MrBird
 */
@FunctionalInterface
public interface JedisExecutor<T, R> {
    R excute(T t) throws RedisConnectException;
}
