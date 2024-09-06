package jp.te4a.spring.boot.mybootapp6;
@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public BookBean save(BookBean bookBean) {
        return bookRepository.save(bookBean);
    }
    public List<BookBean> findAll() {
        return bookRepository.findAll();
    } 
}
