package com.company.repository.name;

import com.company.domain.Name;
import com.company.repository.Repository;

public interface NameRepository extends Repository<Name, String> {
    Name readByName(String name);
}
