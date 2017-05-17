package hello;
import org.springframework.data.repository.CrudRepository;
import hello.Igrushka;
/**
 * Created by Анютка on 17.05.2017.
 */
public interface IgrushkaRepository extends CrudRepository<Igrushka, Long> {
}
