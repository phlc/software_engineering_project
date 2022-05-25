export type Book = {
    id: number;
    coverURL: string;
    rate: number;
    rateNumber: number;
    title: string;
    author: string;
    description: string;
    price: number;
    stock: number;
    category: string;
    releaseDate: Date;
    isRelease: boolean;
    isFavorite: boolean;
};

export type User = {
    id: number;
    email: string;
    password: string;
};

export type AuthenticatedUser = {
    id: number;
    email: string;
    name: string;
    cpf: string;
    password: string;
    cart: UserCart | undefined;
    favoriteBooks: Book[] | undefined;
}

export type UserCart = {
    items: Book[];
    total: number;
}