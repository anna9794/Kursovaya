package hello;

/**
 * Created by Анютка on 13.05.2017.
 */
import hello.model.TipIgrushek;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TipIgrushekRepository extends CrudRepository<TipIgrushek, Integer> {

}
