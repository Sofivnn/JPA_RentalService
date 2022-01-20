package com.JPA.JPA;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceLocationWebServices {

    PersonRepository personRepository;
    VehiculeRepository vehiculeRepository;
    RentRepository rentRepository;

    public ServiceLocationWebServices(PersonRepository personRepository, VehiculeRepository vehiculeRepository, RentRepository rentRepository){
        this.personRepository = personRepository;
        this.vehiculeRepository = vehiculeRepository;
        this.rentRepository = rentRepository;
    }


   @GetMapping(value = "/persons")
   @ResponseStatus(HttpStatus.OK)
   @ResponseBody
    public Iterable<Person> listOfPerson(){
        return personRepository.findAll();
    }


    @GetMapping(value = "/vehicule")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Iterable<Vehicule> listOfVehicule(){
        return vehiculeRepository.findAll();
    }

    @GetMapping(value = "/rent")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Iterable<Rent> listOfRent(){
        return rentRepository.findAll();
    }



}
