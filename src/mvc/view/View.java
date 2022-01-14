package mvc.view;

import mvc.controller.Controller;
import mvc.model.ModelData;

public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}


