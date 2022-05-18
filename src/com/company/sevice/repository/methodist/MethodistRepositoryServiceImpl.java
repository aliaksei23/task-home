package com.company.sevice.repository.methodist;

import com.company.model.persons.Methodist;
import com.company.repository.MethodistRepository;

public class MethodistRepositoryServiceImpl implements MethodistRepositoryService {

    private MethodistRepository methodistRepository;

    @Override
    public void inti(MethodistRepository methodistRepository) {
        this.methodistRepository = methodistRepository;
    }

    @Override
    public void addMethodist(Methodist methodist) {
        methodistRepository.getMethodists().add(methodist);
    }

    @Override
    public void removeMethodist(Methodist methodist) {
        methodistRepository.getMethodists().remove(methodist);
    }
}
