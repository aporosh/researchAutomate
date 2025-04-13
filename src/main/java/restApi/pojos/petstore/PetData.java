package restApi.pojos.petstore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PetData {
    public int id;
    public Category category;
    public String name;
    public ArrayList<String> photoUrls;
    public ArrayList<Tag> tags;
    public String status;

//    public PetData(int i, int i1, String string, String doggie, ArrayList<String> photoUrls, ArrayList<Tag> tags, String available) {
//    }
}
