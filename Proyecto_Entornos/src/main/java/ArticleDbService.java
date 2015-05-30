import java.util.ArrayList;

public interface ArticleDbService<T> {
    public Boolean create(T entity);
    public T readOne(int id);
    public ArrayList<T> readAll();
    public Boolean actualizar(int id, String title, String summary, String content);
    public Boolean borrar(int id);
}
