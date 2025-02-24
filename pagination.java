package Java;

//service class
public class pagination {
    int pageNo = 1;
    int pageSize = 5;

    Pageable p =pageRequest.of(pageNo,pageSize);
    page<post> pagePost = postRepo.findAll(p);
    List<PostDTO> postDtos = pagePost.stream()
                                .map(post -> this.modelMapper.map(post, PostDTO))
                                .collect(Collector.tolist());

    return postDtos;
}
