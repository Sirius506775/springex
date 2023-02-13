package org.towmedical.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("normal")
public class SampleDAOImpl  implements SampleDAO{ //인터페이스인 SampleDAO 의 구현체인 Impl
}
