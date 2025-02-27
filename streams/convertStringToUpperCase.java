// change all Strings to upperCase
List<String> upperCaseStringList = Optional.ofNullable(list)
        .orElse(Collections.emptyList())
        .stream()
        .map(String::toUpperCase) // More concise and readable
        .collect(Collectors.toList());

//change even length to upper case and in output only those should be there
        List<String> upperCaseStringList = Optional.ofNullable(list)
        .orElse(Collections.emptyList())
        .stream()
        .filter(i -> i.length() % 2 == 0)
        .map(String::toUpperCase) // More concise and readable
        .collect(Collectors.toList());

//change even length to upper case and odd length string should be as it is
        List<String> upperCaseStringList = Optional.ofNullable(list)
        .orElse(Collections.emptyList())
        .stream()
        .filter(Objects :: notNull)
        .map(i -> i.lenght() % 2 == 0 ? i.toUpperCase() : i) // More concise and readable
        .collect(Collectors.toList());

//change 1st char of each string to upper case and rest as it is
        List<String> list = Optional.ofNullable(list)
        .orElse(Collections.emptyList())
        .stream()
        .filter(i -> i.subString(0, 1).toUpperCase() + i.subString(1))
        .colect(Collectors.toList())