package com.example.demoGit.Rest;

import com.example.demoGit.model.Student;
import com.example.demoGit.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentServ;

    private final Logger LOG = LoggerFactory.getLogger(getClass());


@PostMapping("/addStudent")
private Student add(@RequestBody Student student) {
    LOG.info("Add student data");
    return studentServ.save(student);
}



    @GetMapping("/allStudents")
    public ResponseEntity <List<Student> >getstudents(){
        LOG.info("Getting all students.");
        List<Student> studentList =studentServ.getAllStudents();
        return  new ResponseEntity <List<Student>> (studentList,HttpStatus.OK);

    }

   // @PutMapping("")
    @DeleteMapping("/deleteStudent/{id}")
   public String deleteStudentByID(@PathVariable("id") Integer ID){
        LOG.info("Delete Student by Id.");
        studentServ.deleteStudentById(ID);
        return "Deleted Successfully";
   }
}
//@RestController
//@RequestMapping(value = "/")
//public class StudentController {
//
//    private final Logger LOG = LoggerFactory.getLogger(getClass());
//
//    private StudentRepo StuRepo;
//
//    public void Student(StudentRepo StuRepo) {
//        this.StuRepo = StuRepo;
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public List<Student> getAllUsers() {
//        LOG.info("Getting all users.");
//        Scanner StuRepository;
//        return StuRepo.findAll();
//    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public Student addNewUsers(@RequestBody Student student) {
//        LOG.info("Saving Student.");
//        return StuRepo.save(student);
//    }
//}
