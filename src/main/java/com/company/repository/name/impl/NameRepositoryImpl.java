package com.company.repository.name.impl;

import com.company.domain.Name;
import com.company.repository.name.NameRepository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NameRepositoryImpl implements NameRepository {
    private List<Name> nameList;
    private static NameRepositoryImpl nameRepository = null;
    private static NameRepositoryImpl getNameRepository(){
        if (nameRepository == null){
            nameRepository = new NameRepositoryImpl();
        }
        return nameRepository;
    }
    //constructor

    public NameRepositoryImpl(){
        this.nameList = new ArrayList<>();
    }
    @Override
    public Name create(Name name) {
        boolean result = nameList.add(name);
        if (result){
            return name;
        }
        return null;
    }

    @Override
    public Name read(String id) {
       return nameList.stream().filter(name1 -> name1.getName.equals(id)).findAny().orElse(null);
    }

    @Override
    public Name update(Name name) {
        Name name1 = read(name.getName());
        if(name!= null){
            delete(name1);
            return create(name);
        }
        return null;
    }

    @Override
    public boolean delete(Name name) {

        return nameList.remove(name);
    }

    @Override
    public Collection<Name> readAll() {
        return nameList;
    }

    @Override
    public Name readByName(String name) {
        return nameList.stream().filter(D ->D.getName().equals(name)).findAny().orElse(null);
    }
}
