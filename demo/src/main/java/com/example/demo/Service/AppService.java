package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Repo.AppRepo;
import com.example.demo.model.AppModel;

@Service
public class AppService {
    @Autowired 
    AppRepo repository;
    public AppModel create(AppModel take1){
        return repository.save(take1);
    }
    //
    public List<AppModel> getAll(){
        return repository.findAll();
    }
}
