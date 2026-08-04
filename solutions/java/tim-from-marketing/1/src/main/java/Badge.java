class Badge {
    public String print(Integer id, String name, String department) {
        // Abteilung Zugerhörigkeit klären
        String deptLabel;
        if (department == null) {
            deptLabel = "OWNER";
        } else {
            deptLabel = department.toUpperCase();
        }

        // ID or no ID?
        if (id == null) {
            return name + " - " + deptLabel;
        } else {
            return "[" + id + "] - " + name + " - " + deptLabel;
        }
}}
