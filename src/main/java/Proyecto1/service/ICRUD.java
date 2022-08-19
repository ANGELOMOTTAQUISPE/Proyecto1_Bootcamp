package Proyecto1.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICRUD <T, V>{
    Mono<T> register(T obj);
    Mono<T> modify(T obj);
    Flux<T> list();
    Mono<T> listofId(V id);
    boolean delete(V id);
}
