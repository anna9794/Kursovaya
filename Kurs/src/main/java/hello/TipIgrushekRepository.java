package hello;

/**
 * Created by Анютка on 13.05.2017.
 */
import org.springframework.data.repository.CrudRepository;

import hello.model.TipIgrushek;


public interface TipIgrushekRepository extends CrudRepository<TipIgrushek, Long> {

}
