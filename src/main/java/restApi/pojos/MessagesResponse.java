package restApi.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessagesResponse {
    public ArrayList<MessageItem> items;
    public PageInfo pageInfo;
    public int totalItems;
    public int totalPages;
}
