package com.company;

import com.company.model.address.Address;
import com.company.model.group.Group;
import com.company.model.persons.Student;
import com.company.model.persons.Teacher;
import com.company.sevice.groupService.GroupServiceImpl;
import com.company.sevice.groupService.GroupServise;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Tolik1" ,"Seriozn1",18,new Address("Grodno1","Ojesko1",11,11));
        Student student2 = new Student("Tolik2" ,"Seriozn2",19,new Address("Grodno2","Ojesko2",12,12));
        Student student3 = new Student("Tolik3" ,"Seriozn3",20,new Address("Grodno3","Ojesko3",13,13));
        Student student4 = new Student("Tolik4" ,"Seriozn4",21,new Address("Grodno4","Ojesko4",14,14));
        Student student5 = new Student("Tolik5" ,"Seriozn5",22,new Address("Grodno5","Ojesko5",15,15));

        Group group = new Group("Toliki",3,new Teacher("Mari","Spiridonova",34,new Address("Grodno","Limoj",24,30),1207));

        GroupServise groupServise = new GroupServiceImpl();
        ((GroupServiceImpl) groupServise).init(group);
        groupServise.addStudentToGroup(student1);
        groupServise.addStudentToGroup(student2);
        groupServise.addStudentToGroup(student3);
        groupServise.addStudentToGroup(student4);
        groupServise.addStudentToGroup(student5);

        System.out.println(group.getStudentList());
        groupServise.changeTeacher(new Teacher("Ann" , "Spiridonova", 28,new Address("Minsk","Mira" ,24,24),1500));
        System.out.println(group.getTeacher());




    }

}
