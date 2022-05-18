package com.company.sevice.repository.methodist;

import com.company.model.persons.Methodist;
import com.company.repository.MethodistRepository;

public interface MethodistRepositoryService {

    void inti (MethodistRepository methodistRepository);

    void addMethodist (Methodist methodist);

    void removeMethodist (Methodist methodist);

}
