import com.lms.book_mgmt.dao.BookDao
import com.lms.book_mgmt.model.Book
import com.lms.book_mgmt.service.BookService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations


class BookServiceTest {

  @Mock
  private  lateinit var bookDao: BookDao

  @InjectMocks
  private lateinit var bookService: BookService


  @BeforeEach
  fun setUp(){
    MockitoAnnotations.openMocks(this)
  }

  @Test
  fun `test viewBook`(){
    val id:Long = 3

    `when`(bookDao.findBookById(id)).thenReturn(Book(3, "Title","Author","Genre","isbm",true))
  }
}