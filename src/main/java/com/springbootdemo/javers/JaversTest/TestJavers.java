package com.springbootdemo.javers.JaversTest;

import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.javers.core.diff.changetype.ValueChange;

import java.util.Arrays;
import java.util.List;

public class TestJavers {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("raviranjan");
        student1.setFavouriteSubject(Arrays.asList("math","science"));
        student1.setTeachers(new Teacher(1,"mukesh"));
        student1.setTeacherList(Arrays.asList(new Teacher(1,"rj"),new Teacher(2,"rk")));

        Student student2 = new Student();
        student2.setId(1);
        student2.setName("raviranjan");
        student2.setFavouriteSubject(Arrays.asList("math","sci","programming"));
        student2.setTeachers(new Teacher(1,"rukesh"));
        student2.setTeacherList(Arrays.asList(new Teacher(1,"rj"),new Teacher(2,"rm")));

        Javers javers = JaversBuilder.javers().build();

        Diff diff = javers.compare(student1,student2);
        List<ValueChange> change = diff.getChangesByType(ValueChange.class);

    }
}
