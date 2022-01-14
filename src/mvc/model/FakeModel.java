package mvc.model;

import mvc.bean.User;

import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    public ModelData getModelData() {
        return modelData;
    }

    public void loadUsers() {
        List<User> users = modelData.getUsers();
        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));
        modelData.setUsers(users);
    }

    public void loadDeletedUsers() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
