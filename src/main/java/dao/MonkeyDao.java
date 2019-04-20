package dao;

import entity.Monkey;

import java.util.List;

public interface MonkeyDao {
    List<Monkey> selectMonkeys();
}
