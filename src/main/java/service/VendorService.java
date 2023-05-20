package service;

import db.JDBiConnector;
import model.Vendor;

import java.util.List;
import java.util.stream.Collectors;

public class VendorService {
    public static List<Vendor> getListVendor() {

//        xử DB ...
            return JDBiConnector.me().withHandle(handle -> {
                return handle.createQuery("select * from vendor").mapToBean(Vendor.class)
                        .stream().collect(Collectors.toList());
            });
        }

//        // xử DB
//        LinkedList<Vendor> list = new LinkedList<>();
//
//
//        Statement statement = DBConnect.getInstall().get();
//        if (statement != null)
//            try {
//                ResultSet rs = statement.executeQuery("select * from vendor");
////                rs.last();
////                System.out.println(rs.getRow());
////                rs.beforeFirst();
//                while (rs.next()) {
//                    list.add(new Vendor(
//                            rs.getInt(1),
//                            rs.getString(2),
//                            rs.getString(3),
//                            rs.getString(4),
//                            rs.getString(5),
//                            rs.getString(6)
//                    ));
//                     }
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        else {
//            System.out.println("no connection");
//        }
//        return list;
//    }
}


////        xử DB ...
//        return JDBiConnector.me().withHandle(handle -> {
//            return handle.createQuery("select * from vendor").mapToBean(Vendor.class)
//                    .stream().collect(Collectors.toList());
//        });
//    }
//}

