package Group2.capstone_project.repository;

import Group2.capstone_project.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {
    void save(Client client);
    Optional<Client> findId(String name, String studentNumber, String email);
    Optional<Client> findPwd(String name, String id, String studentNumber, String question,String answer);
    List<Client> findAll();
    Optional<Client> findById(String id);
    Optional<Client> login(Client client);
    void updatePwd(String id, String newEncodePwd);
    void authJoin(String id);

    void updateInfo(Client client);


}
