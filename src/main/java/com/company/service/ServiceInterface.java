package com.company.service;

import java.util.Collection;

public interface ServiceInterface <D, d>{
    public D create(D d);
    public D read(String id);
    public D update(D d);
    public boolean delete(D d);
    public Collection<D> readAll();
}
