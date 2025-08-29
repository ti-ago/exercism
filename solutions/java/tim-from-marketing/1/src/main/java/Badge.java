class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder sb = new StringBuilder();
        if(id != null){
            sb.append(String.format("[%s] - ",id));            
        }
        sb.append(name);
        if(department != null){
            sb.append(String.format(" - %s", department.toUpperCase()));
        }else{
            sb.append(String.format(" - OWNER"));
        }
        return sb.toString();
    }
}
