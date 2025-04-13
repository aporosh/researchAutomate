package restApi.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageItem {
    public int id;
    public String title;
    public int publishDateUtc;
    public String messageType;
    public String previewBody;
    public boolean isReaded;
}
